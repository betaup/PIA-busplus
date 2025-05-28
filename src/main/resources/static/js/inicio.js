document.addEventListener("DOMContentLoaded", function () {
    const tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'));
    tooltipTriggerList.map(function (tooltipTriggerEl) {
        return new bootstrap.Tooltip(tooltipTriggerEl);
    });
});

document.addEventListener("DOMContentLoaded", function () {
    const logoutAlert = document.getElementById("logoutAlert");
    const triggerLogout = document.getElementById("triggerLogout");
    const cancelLogout = document.getElementById("cancelLogout");

    if (triggerLogout && logoutAlert) {
        triggerLogout.addEventListener("click", function (e) {
            e.preventDefault();
            logoutAlert.classList.remove("d-none");
        });
    }

    if (cancelLogout) {
        cancelLogout.addEventListener("click", function () {
            logoutAlert.classList.add("d-none");
        });
    }
});
