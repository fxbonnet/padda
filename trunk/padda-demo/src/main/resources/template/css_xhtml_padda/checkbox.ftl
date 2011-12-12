<#--
NOTE: The 'header' stuff that follows is in this one file for checkbox due to the fact
that for checkboxes we do not want the label field to show up as checkboxes handle their own
lables
-->
<#assign hasFieldErrors = fieldErrors?? && fieldErrors[parameters.name]??/>
<div <#rt/><#if parameters.id??>id="wwgrp_${parameters.id}"<#rt/></#if> class="checkboxed wwgrp">

<#if hasFieldErrors>
<div <#rt/><#if parameters.id??>id="wwerr_${parameters.id}"<#rt/></#if> class="wwerr">
<#list fieldErrors[parameters.name] as error>
    <div<#rt/>
    <#if parameters.id??>
     errorFor="${parameters.id}"<#rt/>
    </#if>
    class="errorMessage">
             ${error?html}
    </div><#t/>
</#list>
</div><#t/>
</#if>
<#if parameters.labelposition?default("") == 'left'>
<span <#rt/>
<#if parameters.id??>id="wwlbl_${parameters.id}"<#rt/></#if> class="wwlbl">
<label<#t/>
<#if parameters.id??>
 for="${parameters.id?html}"<#rt/>
</#if>
<#if hasFieldErrors>
 class="checkboxErrorLabel"<#rt/>
<#else>
 class="label_text_right"<#rt/>
</#if>
>${parameters.label?html}</label><#rt/>
</span>
</#if>

<#if parameters.labelposition?default("top") == 'top'>
<div <#rt/>
<#else>
<span <#rt/>
</#if>
<#if parameters.id??>id="wwctrl_${parameters.id}"<#rt/></#if> class="wwctrl">

<#if parameters.required?default(false)>
        <span class="required">*</span><#t/>
</#if>

<#include "/${parameters.templateDir}/simple/checkbox.ftl" />
<#if parameters.labelposition?default("") != 'left'>
<#if parameters.labelposition?default("top") == 'top'>
</div> <#rt/>
<#else>
</span>  <#rt/>
</#if>
<#if parameters.label??>
<#if parameters.labelposition?default("top") == 'top'>
<div <#rt/>
<#else>
<span <#rt/>
</#if>
<#if parameters.id??>id="wwlbl_${parameters.id}"<#rt/></#if> class="wwlbl">
<label<#t/>
<#if parameters.id??>
 for="${parameters.id?html}"<#rt/>
</#if>
<#if hasFieldErrors>
 class="checkboxErrorLabel"<#rt/>
<#else>
 class="checkboxLabel"<#rt/>
</#if>
>${parameters.label?html}</label><#rt/>
</#if>
</#if>
<#if parameters.label??>
<#if parameters.labelposition?default("top") == 'top'>
</div> <#rt/>
<#else>
</span> <#rt/>
</#if>
</#if>
</div>
