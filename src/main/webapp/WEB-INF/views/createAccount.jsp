<%@ include file="common/header.jspf"%>
<form action="/create" method="post">
		<div class="container">
			<h1 class="well">Account Opening Form</h1>
			<div class="col-lg-12 well">
				<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>First Name</label> <input type="text"
									placeholder="Enter First Name Here.." class="form-control"
									name="firstname" required>
							</div>
							<div class="col-sm-6 form-group">
								<label>Last Name</label> <input type="text"
									placeholder="Enter Last Name Here.." class="form-control"
									name="lastname" required>
							</div>
						</div>
						
						
							<div class="col-sm-14 form-group">
								<label>Address</label>
								<input type="text" name="address"
									placeholder="Enter Address Here.." class="form-control" required>
							</div>
						
						
						<div class="row">
							<div class="col-sm-4 form-group">
								<label>City</label> <input type="text" name="city"
									placeholder="Enter City Name Here.." class="form-control" required>
							</div>
							<div class="col-sm-4 form-group">
								<label>State</label> <input type="text" name="state"
									placeholder="Enter State Name Here.." class="form-control" required>
							</div>
							<div class="col-sm-4 form-group">
								<label>Zip</label> <input type="text" name="zipcode"
									placeholder="Enter Zip Code Here.." class="form-control" required>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Phone Number</label> <input type="text" name="pnumber"
								placeholder="Enter Phone Number Here.." class="form-control" required>
							</div>
							<div class="col-sm-6 form-group">
								<label>Email Address</label> <input type="text" name="email"
								placeholder="Enter Email Address Here.." class="form-control" required>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Type of Account</label>
								<select class="col-sm-6 form-control" name="accType" required>
                					<option>Account</option>
									<option value="SB Account">SB Account</option>
									<option value="Current Account">Current Account</option>
									<option value="DeMAT Account">DeMAT Account</option>
									<option value="NRE Account">NRE Account</option>									
								</select>
							</div>
						</div>
						<button type="submit" class="btn btn-default" value="Submit">Submit</button>
				</div>		
			</div>
		</div>

</form> 

<%@ include file="common/footer.jspf"%>