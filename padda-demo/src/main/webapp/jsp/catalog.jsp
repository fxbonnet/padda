<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html; charset=UTF-8" %>

<s:if test="%{productList != null && productList.size != 0}">

	<jsp:include page="fragments/catalogDisplay.jsp" />

	<%-- Product list --%>
	<ul class="<s:property value="viewAs.displayName" />">
		<s:iterator value="productList">
			<li class="product">
				<img src="mock/products/<s:property value="imageSrc" />" height="135px" width="135px" />
				<div>
					<a href="#"><s:property value="name" /></a><br/>
					<s:property value="price" /><br/>
					Add to cart<br/>
					Add to wishlist<br/>
					Add to compare<br/>
				</div>
			</li>
		</s:iterator>
	</ul>
</s:if>