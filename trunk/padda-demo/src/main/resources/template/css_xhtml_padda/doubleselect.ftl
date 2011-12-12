<#-- Inclusion du doubleselect de struts pour basculer entre la version originale et la version modifiee /-->
<#-- include "/${parameters.templateDir}/css_xhtml/doubleselect.ftl" /-->

<#include "/${parameters.templateDir}/${parameters.theme}/controlheader.ftl" />
<#include "/${parameters.templateDir}/simple/select.ftl" />
<#include "/${parameters.templateDir}/css_xhtml/controlfooter.ftl" /><#nt/>

<#-- MODIFICATIONS /-->
<#assign hasFieldErrors = parameters.doubleName?? && fieldErrors?? && fieldErrors[parameters.doubleName]??/>
<div <#rt/><#if parameters.doubleId??>id="wwgrp_${parameters.doubleId}"<#rt/></#if> class="wwgrp">
	
<#if hasFieldErrors>
<div <#rt/><#if parameters.doubleId??>id="wwerr_${parameters.doubleId}"<#rt/></#if> class="wwerr">
<#list fieldErrors[parameters.doubleName] as error>
    <div<#rt/>
    <#if parameters.doubleId??>
     errorFor="${parameters.doubleId}"<#rt/>
    </#if>
    class="errorMessage">
             ${error?html}
    </div><#t/>
</#list>
</div><#t/>
</#if>

<#if parameters.doubleLabel??>
<#if parameters.doubleLabelposition?default("top") == 'top'>
<div <#rt/>
<#else>
<span <#rt/>
</#if>
<#if parameters.doubleId??>id="wwlbl_${parameters.doubleId}"<#rt/></#if> class="wwlbl">
    <label <#t/>
<#if parameters.doubleId??>
        for="${parameters.doubleId?html}" <#t/>
</#if>
<#if hasFieldErrors>
        class="errorLabel"<#t/>
<#else>
        class="label"<#t/>
</#if>
    ><#t/>
<#if parameters.doubleRequired?default(false)>
        <span class="required">*</span><#t/>
</#if>
        ${parameters.doubleLabel?html}${parameters.doubleLabelSeparator!":"?html}
<#include "/${parameters.templateDir}/xhtml/tooltip.ftl" />
	</label><#t/>
<#if parameters.doubleLabelposition?default("top") == 'top'>
</div> <br /><#rt/>
<#else>
</span> <#rt/>
</#if>
</#if>
<#if parameters.doubleLabelposition?default("top") == 'top'>
<div <#rt/>
<#else>
<span <#rt/>
</#if>
<#if parameters.doubleId??>id="wwctrl_${parameters.doubleId}"<#rt/></#if> class="wwctrl">
<#-- FIN MODIFICATIONS /-->

<select<#rt/>
 name="${parameters.doubleName?default("")?html}"<#rt/>
<#if parameters.disabled?default(false)>
 disabled="disabled"<#rt/>
</#if>
<#if parameters.doubleTabindex??>
 tabindex="${parameters.doubleTabindex?html}"<#rt/>
</#if>
<#if parameters.doubleId??>
 id="${parameters.doubleId?html}"<#rt/>
</#if>
<#if parameters.doubleCss??>
 class="${parameters.doubleCss?html}"<#rt/>
</#if>
<#if parameters.doubleStyle??>
 style="${parameters.doubleStyle?html}"<#rt/>
</#if>
<#if parameters.title??>
 title="${parameters.title?html}"<#rt/>
</#if>
<#if parameters.multiple?default(false)>
 multiple="multiple"<#rt/>
</#if>
<#if parameters.get("doubleSize")??>
 size="${parameters.get("doubleSize")?html}"<#rt/>
</#if>
<#if parameters.doubleMultiple?default(false)>
 multiple="multiple"<#rt/>
</#if> 
>
</select>



<#assign startCount = 0/>
<#if parameters.headerKey?? && parameters.headerValue??>
    <#assign startCount = startCount + 1/>
</#if>
<#if parameters.emptyOption??>
    <#assign startCount = startCount + 1/>
</#if>

<script type="text/javascript">
<#assign itemCount = startCount/>
    var ${parameters.id?html}Group = new Array(${parameters.listSize} + ${startCount});
    for (i = 0; i < (${parameters.listSize} + ${startCount}); i++)
    ${parameters.id?html}Group[i] = new Array();

<@s.iterator value="parameters.list">
    <#if parameters.listKey??>
        <#assign itemKey = stack.findValue(parameters.listKey)/>
    <#else>
        <#assign itemKey = stack.findValue('top')/>
    </#if>
    <#if parameters.listValue??>
        <#assign itemValue = stack.findString(parameters.listValue)/>
    <#else>
        <#assign itemValue = stack.findString('top')/>
    </#if>
    
    <#assign doubleItemCount = 0/>
    <#if parameters.doubleHeaderKey?? && parameters.doubleHeaderValue??>
    	<#assign doubleHeaderKeyStr = doubleHeaderKey.toString() />
    	${parameters.id?html}Group[${itemCount}][${doubleItemCount}] = new Option("${doubleHeaderValue}", "${doubleHeaderKeyStr}");
    	<#assign doubleItemCount = doubleItemCount + 1/>
    </#if>
	<#if parameters.doubleEmptyOption??>
	    ${parameters.id?html}Group[${itemCount}][${doubleItemCount}] = new Option("", "");
	    <#assign doubleItemCount = doubleItemCount + 1/>
	</#if>
    <@s.iterator value="${parameters.doubleList}">
        <#if parameters.doubleListKey??>
            <#assign doubleItemKey = stack.findValue(parameters.doubleListKey)/>
        <#else>
            <#assign doubleItemKey = stack.findValue('top')/>
        </#if>
        <#assign doubleItemKeyStr = doubleItemKey.toString() />
        <#if parameters.doubleListValue??>
            <#assign doubleItemValue = stack.findString(parameters.doubleListValue)/>
        <#else>
            <#assign doubleItemValue = stack.findString('top')/>
        </#if>
    ${parameters.id?html}Group[${itemCount}][${doubleItemCount}] = new Option("${doubleItemValue}", "${doubleItemKeyStr}");

        <#assign doubleItemCount = doubleItemCount + 1/>
    </@s.iterator>
    <#assign itemCount = itemCount + 1/>
</@s.iterator>

    var ${parameters.id?html}Temp = document.${parameters.formName}.${parameters.doubleId?html};
<#assign itemCount = startCount/>
<#assign redirectTo = 0/>
<@s.iterator value="parameters.list">
    <#if parameters.listKey??>
        <#assign itemKey = stack.findValue(parameters.listKey)/>
    <#else>
        <#assign itemKey = stack.findValue('top')/>
    </#if>
    <#if tag.contains(parameters.nameValue, itemKey)>
        <#assign redirectTo = itemCount/>
    </#if>
    <#assign itemCount = itemCount + 1/>
</@s.iterator>
    ${parameters.id?html}Redirect(${redirectTo});
    function ${parameters.id?html}Redirect(x) {
    	var selected = false;
        for (m = ${parameters.id?html}Temp.options.length - 1; m >= 0; m--) {
            ${parameters.id?html}Temp.options[m] = null;
        }
		
        for (i = 0; i < ${parameters.id?html}Group[x].length; i++) {
            ${parameters.id?html}Temp.options[i] = new Option(${parameters.id?html}Group[x][i].text, ${parameters.id?html}Group[x][i].value);
            <#if parameters.doubleNameValue??>
            	if (${parameters.id?html}Temp.options[i].value == '${parameters.doubleNameValue}') {
            		${parameters.id?html}Temp.options[i].selected = true;
            		selected = true;
            	}
            </#if>
        }

        if ((${parameters.id?html}Temp.options.length > 0) && (! selected)) {
           	${parameters.id?html}Temp.options[0].selected = true;
        }
    }
</script>
<#include "/${parameters.templateDir}/css_xhtml/controlfooter.ftl" /><#nt/>