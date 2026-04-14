// Highlight on hover
function highlight(element) {
    element.classList.add("highlight");
}

function removeHighlight(element) {
    element.classList.remove("highlight");
}

// Validate Name
function validateName() {
    let name = document.getElementById("name").value;
    let error = document.getElementById("nameError");

    if (name.length < 3) {
        error.innerText = "Name must be at least 3 characters";
        return false;
    } else {
        error.innerText = "";
        return true;
    }
}

// Validate Email
function validateEmail() {
    let email = document.getElementById("email").value;
    let error = document.getElementById("emailError");

    let pattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;

    if (!email.match(pattern)) {
        error.innerText = "Enter valid email";
        return false;
    } else {
        error.innerText = "";
        return true;
    }
}

// Submit Form (Double Click)
function submitForm() {
    let isNameValid = validateName();
    let isEmailValid = validateEmail();

    if (isNameValid && isEmailValid) {
        alert("✅ Feedback submitted successfully!");
    } else {
        alert("❌ Please fix errors before submitting");
    }
}
