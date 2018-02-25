$(function(){
	
	var $table = $('#employeeListTable');

	if ($table.length) {


		var jsonUrl = '';
			jsonUrl = window.contextRoot + '/json/employees';

	$table
	.DataTable({
		lengthMenu : [ [ 5, 10, -1 ],
				[ '5 Records', '10 Records', 'All' ] ],
		pageLength : 5,
		ajax : {
			url : jsonUrl,
			dataSrc : ''
		},
		columns : [
				{
					data : 'employeeName',
				mRender : function(data, type, row) {
					var str = '';
					str += '<a href="'
							+ window.contextRoot
							+ '/'
							+ row.employeeId
							+ '">'+data+'</a>';

					return str;
				}
				},
				{
					data : 'workPhone',
				},
				{
					data : 'workEmail',
				},
				{
					data : 'department',
				},
				{
					data : 'jobTitle',
				},
				{
					data : 'manager',
				},]

	});
}
	
	
});

function fetchList(type){
	$.ajax({
		type : "GET",
		url : "/employee",
		success : function(data){
			$(".panel-body").html(data);
		}
	});
}


