$(document).ready(function () {
  $("#nav-head").scrollToFixed();

  $(".filter-button").click(function () {
    var value = $(this).attr("data-filter");

    if (value == "all") {
      $(".filter").show("100");
    } else {
      $(".filter")
        .not("." + value)
        .hide("50");
      $(".filter")
        .filter("." + value)
        .show("50");
    }

    // Remove 'active' class from all buttons and add it only to the clicked one
    $(".filter-button").removeClass("active");
    $(this).addClass("active");
  });
});

// Wait for the document to be fully loaded
document.addEventListener("DOMContentLoaded", function () {
  // Find the button by its ID
  var submitBtn = document.getElementById("submitBtn");

  // Add a click event listener to the button
  submitBtn.addEventListener("click", function () {
    // Display a pop-up message when the button is clicked
    alert(
      "Lab test booked successfully. You will receive a confirmation message, and payment will be done after pickup."
    );
  });
});
