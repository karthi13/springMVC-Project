<%@ include file="common/header.jspf"%>
<div class="container">
  
  <form action="/credit" class="form-horizontal" role="form" method="post">
    <fieldset>
      <legend>Payment</legend>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="card-holder-name">Name on Card</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="name" id="name" placeholder="Card Holder's Name" required>
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="card-number">Card Number</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="cardnumber" id="cardnumber" placeholder="Debit/Credit Card Number" required>
        </div>
      </div>
      <!-- <div class="form-group">
        <label class="col-sm-3 control-label" for="expiry-month" required>Expiration Date</label>
        <div class="col-sm-9">
          <div class="row">
            <div class="col-xs-3">
              <select class="form-control col-sm-2"  required name="expirymonth" id="expirymonth">
                <option>Month</option>
                <option value="01">Jan (01)</option>
                <option value="02">Feb (02)</option>
                <option value="03">Mar (03)</option>
                <option value="04">Apr (04)</option>
                <option value="05">May (05)</option>
                <option value="06">June (06)</option>
                <option value="07">July (07)</option>
                <option value="08">Aug (08)</option>
                <option value="09">Sep (09)</option>
                <option value="10">Oct (10)</option>
                <option value="11">Nov (11)</option>
                <option value="12">Dec (12)</option>
              </select>
            </div>
            <div class="col-xs-3">
              <select class="form-control" name="expiryyear" required>

                <option value="18">2018</option>
                <option value="19">2019</option>
                <option value="20">2020</option>
                <option value="21">2021</option>
                <option value="22">2022</option>
                <option value="23">2023</option>
                <option value="24">2024</option>
              </select>
            </div>
          </div>
        </div>
      </div> -->
      <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Card CVV</label>
        <div class="col-sm-3">
          <input type="text" class="form-control" name="cvv" required id="cvv" placeholder="Security Code">
        </div>
      </div>
      
      
      <div class="form-group">
        <label class="col-sm-3 control-label" for="amount">Amount</label>
        <div class="col-sm-3">
          <input type="text" class="form-control" name="amount"  required id="amount" placeholder="Amount">
        </div>
      </div>
      
      <div class="form-group">
        <div class="col-sm-offset-3 col-sm-9">
          <button type="submit" class="btn btn-success">Authenticate</button>
        </div>
      </div>
    </fieldset>
    ${error}
  </form>
</div>
<%@ include file="common/footer.jspf"%>