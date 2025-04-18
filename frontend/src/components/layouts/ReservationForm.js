export function ReservationForm() {
  return (
    <div
      id="reservation"
      className="reservations-main pad-top-100 pad-bottom-100"
    >
      <div className="container">
        <div className="row">
          <div className="form-reservations-box">
            <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12">
              <div
                className="wow fadeIn"
                data-wow-duration="1s"
                data-wow-delay="0.1s"
              >
                <h2 className="block-title text-center">Reservations</h2>
              </div>
              <h4 className="form-title">BOOKING FORM</h4>
              <p>PLEASE FILL OUT ALL REQUIRED* FIELDS. THANKS!</p>

              <form
                id="contact-form"
                method="post"
                className="reservations-box"
                name="contactform"
                action="mail.php"
              >
                <div className="col-lg-6 col-md-6 col-sm-6 col-xs-12 px-3">
                  <div className="form-box">
                    <input
                      type="text"
                      name="form_name"
                      id="form_name"
                      placeholder="Name"
                      required="required"
                      data-error="Firstname is required."
                    />
                  </div>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 col-xs-12 px-3">
                  <div className="form-box">
                    <input
                      type="email"
                      name="email"
                      id="email"
                      placeholder="E-Mail ID"
                      required="required"
                      data-error="E-mail id is required."
                    />
                  </div>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 col-xs-12 px-3">
                  <div className="form-box">
                    <input
                      type="text"
                      name="phone"
                      id="phone"
                      placeholder="contact no."
                    />
                  </div>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 col-xs-12 px-3">
                  <div className="form-box">
                    <select
                      name="no_of_persons"
                      id="no_of_persons"
                      className="selectpicker"
                    >
                      <option selected disabled>
                        No. Of persons
                      </option>
                      <option>1</option>
                      <option>2</option>
                      <option>3</option>
                    </select>
                  </div>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 col-xs-12 px-3">
                  <div className="form-box">
                    <input
                      type="text"
                      name="date-picker"
                      id="date-picker"
                      placeholder="Date"
                      required="required"
                      data-error="Date is required."
                    />
                  </div>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 col-xs-12 px-3">
                  <div className="form-box">
                    <input
                      type="text"
                      name="time-picker"
                      id="time-picker"
                      placeholder="Time"
                      required="required"
                      data-error="Time is required."
                    />
                  </div>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 col-xs-12 px-3">
                  <div className="form-box">
                    <select
                      name="preferred_food"
                      id="preferred_food"
                      className="selectpicker"
                    >
                      <option selected disabled>
                        preferred food
                      </option>
                      <option>Indian</option>
                      <option>Continental</option>
                      <option>Mexican</option>
                    </select>
                  </div>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 col-xs-12 px-3">
                  <div className="form-box">
                    <select
                      name="occasion"
                      id="occasion"
                      className="selectpicker"
                    >
                      <option selected disabled>
                        Occasion
                      </option>
                      <option>Wedding</option>
                      <option>Birthday</option>
                      <option>Anniversary</option>
                    </select>
                  </div>
                </div>

                <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12 px-3">
                  <div className="reserve-book-btn text-center">
                    <button
                      className="hvr-underline-from-center"
                      type="submit"
                      value="SEND"
                      id="submit"
                    >
                      BOOK MY TABLE{" "}
                    </button>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
