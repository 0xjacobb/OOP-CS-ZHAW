'use strict'
// Event Handler wenn die Buttons gedrückt werden, werden die Funktionen ausgeführt
document.querySelector('#berechnen').addEventListener('click', BMIberechnen);
document.querySelector('#loeschen').addEventListener('click', werteLoeschen);

function BMIberechnen (){
  var groesse = parseInt(document.getElementById("groesse").value);
  var gewicht = parseInt(document.getElementById("gewicht").value);

  if (!groesse || !gewicht) {
    alert('Bitte füllen Sie beide Felder aus.');
    return;
  }

  var bmi = (gewicht / ((groesse / 100) * (groesse / 100))).toFixed(2);

  var bmitext = 'Ihr BMI beträgt ';
  if (bmi < 18.5) {
    bmitext = bmitext + bmi + ' (Untergewicht)';
  } else if (bmi >= 18.5 && bmi <= 25) {
    bmitext = bmitext + bmi + ' (Normalgewicht)';
  } else {
    bmitext = bmitext + bmi + ' (Übergewicht)';
  }

  document.querySelector("value").textContent = bmitext;
}

function werteLoeschen (){
   document.getElementById("groesse").value = '';
   document.getElementById("gewicht").value = '';
   document.querySelector("value").textContent = '';
}
