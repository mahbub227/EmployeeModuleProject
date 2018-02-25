<div class="panel panel-default">
<div class="panel-heading">
					<a href="${path}/create" class="btn btn-info">Create</a>
				</div>
				<div class="panel-body">

					<table id="employeeListTable"
						class="table table-bordered table-condensed table-hover table-striped">
						<thead>
							<tr>
								<th>Name</th>
								<th>Work Phone</th>
								<th>Work Email</th>
								<th>Department</th>
								<th>Job Title</th>
								<th>Manager</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${employeeList}" var="employees">
								<tr>
									<td>${employees.employeeName}</td>
									<td>${employees.workPhone}</td>
									<td>${employees.workEmail}</td>
									<td>${employees.department}</td>
									<td>${employees.jobTitle}</td>
									<td>${employees.manager}</td>
								</tr>
							</c:forEach>
						</tbody>

					</table>

				</div>
				</div>