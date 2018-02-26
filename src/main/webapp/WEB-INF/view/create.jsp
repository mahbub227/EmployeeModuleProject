
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<div class="row">
	<div class="col-xs-12">
		<ol class="breadcrumb">
			<li><a href="${contextRoot}/employee">Employee</a></li>
			<li class="active">New</li>

		</ol>
	</div>
</div>
<sf:form method="post" modelAttribute="employee"
	action="${contextRoot}/employee/create">
	<sf:hidden path="employeeId"/>
	<div class="panel panel-default" >
		<div class="panel-heading">
			<input type="submit" name="submit" id="submit" value="Submit"
				class="btn btn-primary" /> <a class="btn btn-danger" href="${path}">Discard</a>
		</div>
		<div class="panel-body">
			<div class="row">
				<div class="col-sm-3">
					
				</div>
				<div class="col-sm-9">
					<div class="form-group">
						<label class="control-label" for="employeeName"> Name</label>
						<sf:input type="text" path="employeeName" id="employeeName"
							placeholder="Employee Name" class="form-control" />
						<sf:errors path="employeeName" cssClass="help-block" element="em" />
					</div>
					
					<div class="form-group">
								
									<select class="form-control" id="jobType" path="jobType">
										<option value="Part Time">Part Time</option>
										<option value="Full Time">Full Time</option>
										<option value="Contractual">Contractual</option>
									</select>
								
							</div>
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
								<div class="col-md-8">
									<sf:input type="text" path="workAddress" id="workAddress"
										placeholder="" class="form-control" />
									<sf:errors path="workAddress" cssClass="help-block" element="em" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="workMobile">Work
									Mobile</label>
								<div class="col-md-8">
									<sf:input type="text" path="workMobile" id="workMobile"
										placeholder="" class="form-control" />
									<sf:errors path="workMobile" cssClass="help-block" element="em" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="workLocation">Work
									Location</label>
								<div class="col-md-8">
									<sf:input type="text" path="workLocation" id="workLocation"
										placeholder="" class="form-control" />
									<sf:errors path="workLocation" cssClass="help-block"
										element="em" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="workEmail">Work
									Email</label>
								<div class="col-md-8">
									<sf:input type="text" path="workEmail" id="workEmail"
										placeholder="" class="form-control" />
									<sf:errors path="workEmail" cssClass="help-block" element="em" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="workPhone">Work
									Phone</label>
								<div class="col-md-8">
									<sf:input type="text" path="workPhone" id="workPhone"
										placeholder="" class="form-control" />
									<sf:errors path="workPhone" cssClass="help-block" element="em" />
								</div>
							</div>


						</div>


						<div class="col-sm-6">
							<h1>Position</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="department">Department</label>
								<div class="col-md-8">
									<sf:select class="form-control" id="department" path="department">
										<option value="Management">Management</option>
										<option value="Professional Services">Professional
											Services</option>
										<option value="Research & Development">Research &
											Development</option>
										<option value="Sales">Sales</option>
									</sf:select>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="jobTitle">Job
									Title</label>
								<div class="col-md-8">
									<sf:select class="form-control" id="jobTitle" path="jobTitle">
										<option value="CTO">CTO</option>
										<option value="Consultant">Consultant</option>
										<option value="HRM">HRM</option>
										<option value="Experienced Developer">Experienced
											Developer</option>
										<option value="Marketing Manager">Marketing Manager</option>
										<option value="Trainee">Trainee</option>
									</sf:select>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Manager</label>
								<div class="col-md-8">
									<sf:select path="manager" items="${employees}"
										itemLabel="employeeName" itemValue="employeeId"
										class="form-control" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Coach</label>
								<div class="col-md-8">
									<sf:select path="coach" items="${employees}"
										itemLabel="employeeName" itemValue="employeeId"
										class="form-control" />
								</div>
							</div>

						</div>

					</div>
					<div class="row">
						<div class="col-sm-12">
							<div class="form-group">
								<sf:textarea path="otherInformation" id="otherInformation"
									rows="4" placeholder="Other Information" class="form-control" />
								<sf:errors path="otherInformation" cssClass="help-block"
									element="em" />

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
								<div class="col-md-8">
									<sf:select class="form-control" id="nationality"
										path="nationality">
										<option itemValue=="Bangladesh">Bangladesh</option>
										<option value="Japan">Japan</option>
										<option value="Finland">Finland</option>
										<option value="USA">USA</option>
										<option value="Singapore">Singapore</option>
										<option value="UK">UK</option>
									</sf:select>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="identificationNo">Identification
									No</label>
								<div class="col-md-8">
									<sf:input type="text" path="identificationNo"
										id="identificationNo" placeholder="" class="form-control" />
									<sf:errors path="identificationNo" cssClass="help-block"
										element="em" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="passportNo">Passport
									No</label>
								<div class="col-md-8">
									<sf:input type="text" path="passportNo" id="passportNo"
										placeholder="" class="form-control" />
									<sf:errors path="passportNo" cssClass="help-block" element="em" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="bankAcNo">Bank A/C No</label>
								<div class="col-md-8">
									<sf:input type="text" path="bankAcNo" id="bankAcNo"
										placeholder="" class="form-control" />
									<sf:errors path="bankAcNo" cssClass="help-block" element="em" />
								</div>
							</div>

						</div>

						<div class="col-md-6">
							<h1>Contact Information</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="homeAddress">Home
									Address</label>
								<div class="col-md-8">
									<sf:input type="text" path="homeAddress" id="homeAddress"
										placeholder="" class="form-control" />
									<sf:errors path="homeAddress" cssClass="help-block"
										element="em" />
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<h1>Status</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="gender">Gender</label>
								<div class="col-md-8">
									<sf:select class="form-control" id="gender" path="gender">
										<option value="Male">Male</option>
										<option value="Female">Female</option>
										<option value="Other">Other</option>
									</sf:select>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-4" for="maritalStatus">Marital
									Status</label>
								<div class="col-md-8">
									<sf:select class="form-control" id="maritalStatus"
										path="maritalStatus">
										<option value="Single">Single</option>
										<option value="Married">Married</option>
										<option value="Divorced">Divorced</option>
									</sf:select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<h1>Birth</h1>
							<div class="form-group">
								<label class="control-label col-md-4" for="dateOfBirth">Date
									Of Birth</label>
								<div class="col-md-8">
									<sf:input type="date" path="dateOfBirth" id="dateOfBirth"
										class="form-control" />
									<sf:errors path="dateOfBirth" cssClass="help-block"
										element="em" />
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</sf:form>
