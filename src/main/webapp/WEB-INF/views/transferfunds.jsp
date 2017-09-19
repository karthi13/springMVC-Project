<%@ include file="common/header.jspf"%>
<body>
	<div class="container">
		<form action="/transfer" class="form-horizontal" role="form"
			method="post">
			<fieldset>
				<legend>Transfer</legend>
				<div class="form-group">
					<label class="col-sm-3 control-label">Name Of the Account
						Holder</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="accountHolderName"
							 placeholder="Account Holder's Name">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">Account Number</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="accountNumber"
							id="account-number" placeholder="Account Number">
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label">Amount to transfer</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="transferAmt"
							id="transfer" placeholder="Enter the amount to transfer">
					</div>
				</div>


				<div class="form-group">
					<div class="col-sm-offset-3 col-sm-9">
						<button type="submit" name="debit" value="debit" class="btn btn-success">Debit To</button>
						<button type="submit" name="debit" value="credit" class="btn btn-success">Credit To</button>
					</div>
				</div>

			</fieldset>
		</form>
	</div>
<%@ include file="common/footer.jspf"%>