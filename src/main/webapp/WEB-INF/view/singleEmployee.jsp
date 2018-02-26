

<div class="row">
	<div class="col-xs-12">
		<ol class="breadcrumb">
			<li><a href="${contextRoot}/employee">Employee</a></li>
			<li class="active">${employee.employeeName}</li>

		</ol>
	</div>
</div>
	<div class="panel panel-default" >
		<div class="panel-heading">
	
			<a class="btn btn-primary" href="${path}/edit?id=+${employee.employeeId}">Edit</a>
			<a class="btn btn-success" href="${path}/create">Create</a>
		</div>
		<div class="panel-body">
			<div class="row">
				<div class="col-sm-3">
					
				</div>
				<div class="col-sm-9">
				<h1>${employee.employeeName}</h1>
				</div>
			</div>

			<ul class="nav nav-tabs">
				<li class="active"><a data-toggle="tab" href="#public">Public
						Information</a></li>
				<li><a data-toggle="tab" href="#personal">Personal
						Information</a></li>
			</ul>
			<div class="tab-content">
				<div id="public" class="tab-pane fade in active">
					<div class="row">
						<div class="col-sm-6">
							<h1>Contact Information</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="workAddress">Work
									Address</label>
								<label class="control-label col-md-8" for="workAddress">${employee.workAddress}</label>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="workMobile">Work
									Mobile</label>
								<label class="control-label col-md-8" for="workMobile">${employee.workMobile}</label>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="workLocation">Work
									Location</label>
								<label class="control-label col-md-8" for="workLocation">${employee.workLocation}</label>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="workEmail">Work
									Email</label>
								<label class="control-label col-md-8" for="workEmail">${employee.workEmail}</label>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="workPhone">Work
									Phone</label>
								<label class="control-label col-md-8" for="workPhone">${employee.workPhone}</label>
							</div>


							


						</div>


						<div class="col-sm-6">
							<h1>Position</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="department">Department</label>
							    <label class="control-label col-md-8" for="department">${employee.department}</label>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="jobTitle">Job
									Title</label>
								 <label class="control-label col-md-8" for="jobTitle">${employee.jobTitle}</label>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Manager</label>
								 <label class="control-label col-md-8" for="manager">${employee.manager}</label>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Coach</label>
								 <label class="control-label col-md-8" for="coach">${employee.coach}</label>
							</div>
						</div>

					</div>
					<div class="row">
						<div class="col-sm-12">
							<div class="form-group">
						<h1>${employee.otherInformation}</h1>

							</div>
						</div>
					</div>

				</div>

				<div id="personal" class="tab-pane fade">
					<div class="row">
						<div class="col-md-6">
							<h1>Citizenship & Other Information</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="nationality">Nationality</label>
								<label class="control-label col-md-8" for="nationality">${employee.nationality}</label>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="identificationNo">Identification
									No</label>
								<label class="control-label col-md-8" for="identificationNo">${employee.identificationNo}</label>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="passportNo">Passport
									No</label>
								<label class="control-label col-md-8" for="passportNo">${employee.passportNo}</label>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="bankAcNo">Bank A/C No</label>
								<label class="control-label col-md-8" for="bankAcNo">${employee.bankAcNo}</label>
							</div>

						</div>

						<div class="col-md-6">
							<h1>Contact Information</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="homeAddress">Home
									Address</label>
								<label class="control-label col-md-8" for="homeAddress">${employee.homeAddress}</label>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<h1>Status</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="gender">Gender</label>
								<label class="control-label col-md-8" for="gender">${employee.gender}</label>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="maritalStatus">Marital
									Status</label>
								<label class="control-label col-md-8" for="maritalStatus">${employee.maritalStatus}</label>
							</div>
						</div>
						<div class="col-md-6">
							<h1>Birth</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="dateOfBirth">Date
									Of Birth</label>
								<label class="control-label col-md-8" for="dateOfBirth">${employee.dateOfBirth}</label>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
