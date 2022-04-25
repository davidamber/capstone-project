const form1 = document.getElementById('form1');
// const username = document.getElementById('username');
const email = document.getElementById('email');
const confirmEmail = document.getElementById('confirmEmail');
const password = document.getElementById('password');
const confirmPassword = document.getElementById('confirmPassword');

form1.addEventListener('submit', function (e) {
    // e.preventDefault();
    validate();
});

function validate() {
    // const usernameValue = username.value.trim();
    // const emailValue = email.value.trim();
    // const passwordValue = password.value.trim();
    // const password2Value = password2.value.trim();
    validateEmail(email.value, confirmEmail.value);
    validatePasswords(password.value, confirmPassword.value);
}

function validateUsername(usernameInput) {
    if (usernameInput === '') {
        alert("Username cannot be blank");
        username.style.border = "3px solid red";
        return false;
    } else {
        return true;
    }
}

function validateEmail(emailInput) {
    if (/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$/.test(emailInput)) {
        alert('Email is not valid');
        email.style.border = "3px solid red";
        return false;
    } else if (emailInput !== confirmEmailInput) {
        alert("Emails must match");
        confirmEmail.style.border = "3px solid red";
        return false;
    } else {
        return true;
    }
}

function validatePasswords(passwordInput, confirmPasswordInput) {
    if (passwordInput === '') {
        alert("Password cannot be blank");
        password.style.border = "3px solid red";
        return false;
    } else if (passwordInput !== confirmPasswordInput) {
        alert("Passwords must match");
       confirmPassword.style.border = "3px solid red";
        return false;
    } else {
        return true;
    }


}








