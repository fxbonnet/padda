<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html; charset=UTF-8" %>
<html xml:lang="fr" lang="fr" xmlns="http://www.w3.org/1999/xhtml"> 
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title>Padda</title>
		<link rel="stylesheet" href="styles/960/reset.css" />
		<link rel="stylesheet" href="styles/960/text.css" />
		<link rel="stylesheet" href="styles/960/960.css" />
		<link rel="stylesheet" href="styles/padda-front.css" />
		<s:head/>
	</head>
	<body>
		<div id="page" class="container_12">
		
			<div id="logo"><h1>Padda Shop</h1></div>
			
			<%-- Categories menu --%>
			<div id="navCategories">	
				<s:iterator value="rootCategories">
					<s:url id="categoryUrl" action="category">
				        <s:param name="categoryId" value="id" />
				    </s:url>
					<s:a href="%{#categoryUrl}">
						<s:property value="name" />
					</s:a>
				</s:iterator>
			</div>
			
			<%-- Breadcrumbs --%>
			<div id="breadcrumbs">
				<s:a action="category">Home</s:a>
				<s:iterator value="parentCategoryList">
					/ <s:a action="category" >
						<s:param name="categoryId" value="id" />
						<s:property value="name" />
					</s:a>
				</s:iterator>
			</div>
			
			<div id="sidebar" class="grid_3">

				<%-- Current category --%>
				<h2 id="currentCategory"><s:property value="%{category.name}" /></h2>
				
				<%-- Browse by category --%>
				<div id="subCategories">
					<s:if test="%{subCategoryList != null && subCategoryList.size() != 0}">
						Browse by category
						<ul>
							<s:iterator value="subCategoryList">
								<li>
									<s:a action="category">
										<s:param name="categoryId" value="id" />
										<s:property value="name" />
									</s:a>
								</li>
							</s:iterator>
						</ul>
					</s:if>
				</div>
			</div>
		
			<div id="main" class="grid_9">
				<tiles:insertAttribute name='body' />
			</div>
		</div>
		
		<script type="text/javascript" src="javascript/jquery-1.7.min.js"></script>
		<script type="text/javascript" src="javascript/padda.js"></script>
	</body>
</html>