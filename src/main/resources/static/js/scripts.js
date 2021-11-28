/*!
    * Start Bootstrap - SB Admin v7.0.4 (https://startbootstrap.com/template/sb-admin)
    * Copyright 2013-2021 Start Bootstrap
    * Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-sb-admin/blob/master/LICENSE)
    */
    // 
// Scripts
// 

window.addEventListener('DOMContentLoaded', event => {

    // Toggle the side navigation
    const sidebarToggle = document.body.querySelector('#sidebarToggle');
    if (sidebarToggle) {
        // Uncomment Below to persist sidebar toggle between refreshes
        // if (localStorage.getItem('sb|sidebar-toggle') === 'true') {
        //     document.body.classList.toggle('sb-sidenav-toggled');
        // }
        sidebarToggle.addEventListener('click', event => {
            event.preventDefault();
            document.body.classList.toggle('sb-sidenav-toggled');
            localStorage.setItem('sb|sidebar-toggle', document.body.classList.contains('sb-sidenav-toggled'));
        });
    }

});


		//Inicialização do jquery
		$(document).ready(function () {

			$("#data").mask("00/00/0000");
			$("#cnpj").mask("00.000.000/0000-00");
			$("#cpf").mask("000.000.000-00");
			$("#telefone").mask("(21)00000-0000");

			$("#fcadastro").validate();

			$("#cep").blur(function () {

				var cepDigitado = $("#cep").val();

				if (cepDigitado.length == 8) {

					$.getJSON("https://viacep.com.br/ws/" + cepDigitado + "/json/",
						function (endereco) {

							if (!endereco.erro) {
								$("#logradouro").val(endereco.logradouro);
								$("#bairro").val(endereco.bairro);
								$("#cidade").val(endereco.localidade);
								$("#uf").val(endereco.uf);
								$("#numero").focus();
							} else {
								alert("Cep não encontrado!");
							}

						});
				}

			});


		});
