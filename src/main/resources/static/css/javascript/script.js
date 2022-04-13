const form1 = document.getElementById('form1');
const username = document.getElementById('username');
const email = document.getElementById('email');
const password = document.getElementById('password');
const password2 = document.getElementById('password2');

form1.addEventListener('submit', function (e) {
    e.preventDefault();
    validate();
});

function validate() {
    // const usernameValue = username.value.trim();
    // const emailValue = email.value.trim();
    // const passwordValue = password.value.trim();
    // const password2Value = password2.value.trim();
    validateUsername(username.value);
    validateEmail(email.value);
    validatePasswords(password.value, password2.value);
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
    if (/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/.test(emailInput)) {
        alert('Email is not valid');
        email.style.border = "3px solid red";
        return false;
    } else {
        return true;
    }
}

function validatePasswords(passwordInput, password2Input) {
    if (passwordInput === '') {
        alert("Password cannot be blank");
        password.style.border = "3px solid red";
        return false;
    } else if (passwordInput !== password2Input) {
        alert("Passwords must match");
        password.style.border = "3px solid red";
        return false;
    } else {
        return true;
    }
}








