$(document).ready(function() {
	
	$("#sortBy").change(function() {
		$("#sortOrder").val("ASC");
		$("#numPage").val(1);
		$("#categoryDisplayForm").submit();
	});
	
	$("#sortAscLink").click(function() {
		$("#sortOrder").val("ASC");
		$("#numPage").val(1);
		$("#categoryDisplayForm").submit();
	});
	
	$("#sortDescLink").click(function() {
		$("#sortOrder").val("DESC");
		$("#numPage").val(1);
		$("#categoryDisplayForm").submit();
	});
	
	$("#gridViewLink").click(function() {
		$("#viewAs").val("GRID");
		$("#categoryDisplayForm").submit();
	});
	
	$("#listViewLink").click(function() {
		$("#viewAs").val("LIST");
		$("#categoryDisplayForm").submit();
	});
	
	$("#itemsPerPage").change(function() {
		$("#numPage").val(1);
		$("#categoryDisplayForm").submit();
	});

	$("#nextPage").click(function() {
		$("#numPage").val(parseInt($("#numPage").val(), 10) + 1);
		$("#categoryDisplayForm").submit();
	});
	
	$("#prevPage").click(function() {
		$("#numPage").val(parseInt($("#numPage").val(), 10) - 1);
		$("#categoryDisplayForm").submit();
	});
});