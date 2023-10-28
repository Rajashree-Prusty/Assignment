const form = document.getElementById("surveyForm");
const resetButton = document.getElementById("resetButton");
const submitButton = document.getElementById("submitButton");
const popup = document.getElementById("popup");
const popupContent = document.getElementById("popupContent");
const surveyData = document.getElementById("surveyData");

resetButton.addEventListener("click", resetForm);
submitButton.addEventListener("click", submitForm);

function resetForm() {
    form.reset();
}

function submitForm() {
    if (form.checkValidity()) {
        // Display survey data in the popup
        const data = {
            "First Name": form.firstName.value,
            "Last Name": form.lastName.value,
            "Date of Birth": form.dob.value,
            "Country": form.country.value,
            "Gender": Array.from(form.gender).filter(checkbox => checkbox.checked).map(checkbox => checkbox.value).join(", "),
            "Profession": form.profession.value,
            "Email": form.email.value,
            "Mobile Number": form.mobile.value,
        };

        surveyData.innerHTML = "";
        for (const key in data) {
            surveyData.innerHTML += `<p><strong>${key}:</strong> ${data[key]}</p>`;
        }

        // Show the popup
        popup.style.display = "block";
    }
}

function closePopup() {
    popup.style.display = "none";
}
