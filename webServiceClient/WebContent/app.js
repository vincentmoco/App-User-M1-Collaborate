/**
 *  26/06/2021
 */
 

var modal = document.getElementById("myWindow");
var btn = document.getElementById("btnInformations");
var span = document.getElementsByClassName("close-info")[0];


btn.onclick = function() {
  modal.style.display = "block";
}


span.onclick = function() {
  modal.style.display = "none";
}


window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
} 