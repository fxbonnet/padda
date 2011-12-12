<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html; charset=UTF-8" %>

<s:form action="category" id="categoryDisplayForm" method="get">
	<s:hidden name="categoryId" value="%{category.id}" />
	<s:hidden name="sortOrder" id="sortOrder" value="%{sortOrder}" />
	<s:hidden name="viewAs" id="viewAs" value="%{viewAs}" />
	<s:hidden name="pagination.numPage" id="numPage" value="%{pagination.numPage}" />

	<%-- Display options --%>
	<div class="displayOptions">
		<span>
			View as <a id="gridViewLink" href="#">grid</a> <a id="listViewLink" href="#">list</a><br/>
		</span>
		<span>
			Sort by <s:select id="sortBy" name="sortBy" list="sortingCriteriaList" listValue="displayName" theme="simple" />
			<s:if test="sortOrder != 'DESC'"><a id="sortDescLink" href="#"><img src="images/sort_asc_arrow.gif" /></a></s:if>
			<s:else><a id="sortAscLink" href="#"><img src="images/sort_desc_arrow.gif" /></a></s:else>
		</span>
	</div>

	<%-- Pagination --%>
	<div class="pagination">
		<span>
			Items <s:property value="pagination.firstItemIndex" />-<s:property value="pagination.lastItemIndex" /> of <s:property value="pagination.numberOfItems" />
		</span>
		<span>
			<s:if test="pagination.numPage > 1"><a id="prevPage" href="#">&lt;</a></s:if>
			Page <s:property value="pagination.numPage" /> of <s:property value="pagination.numberOfPages" />
			<s:if test="pagination.numPage < pagination.numberOfPages"><a id="nextPage" href="#">&gt;</a></s:if>
		</span>
		<span>
			Résultats par page
			<select id="itemsPerPage" name="pagination.itemsPerPage">
				<option value="10" <s:if test="pagination.itemsPerPage == 10">selected="selected"</s:if>>10</option>
				<option value="20" <s:if test="pagination.itemsPerPage == 20">selected="selected"</s:if>>20</option>
				<option value="30" <s:if test="pagination.itemsPerPage == 30">selected="selected"</s:if>>30</option>
			</select>
		</span>
	</div>
</s:form>

