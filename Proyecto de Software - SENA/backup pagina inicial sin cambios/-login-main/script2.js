function mostrarCamposRestaurante() {
    const tipoCuenta = document.querySelector('input[name="account-type"]:checked').value;
    const camposRestaurante = document.querySelectorAll('.restaurante-field');
    const camposPersonales = document.querySelectorAll('.personal-field');

    if (tipoCuenta === 'restaurant') {
      camposRestaurante.forEach((campo) => {
        campo.style.display = 'block';
      });
      camposPersonales.forEach((campo) => {
        campo.disabled = true;
      });
    } else {
      camposRestaurante.forEach((campo) => {
        campo.style.display = 'none';
      });
      camposPersonales.forEach((campo) => {
        campo.disabled = false;
      });
    }
  }