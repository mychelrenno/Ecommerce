///* 
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//function grava() {
//    var parametros = $("[id='form-manutencao']").serializeJSON();// captura os campos da tela
//        parametros['cidc.cidcNotificacaoObrigatoria']  = $("[id='inputEmail']");
//    
//    $.ajax({
//        async: false,
//        url: 'cid/grava',
//        type : "POST",
//        dataType: 'json',
//        data: parametros,//joga para controller
//        beforeSend: function() {
//            $(".load-ajax").css({
//                display:"block"
//            });
//        },
//        error: function(xhr, status, error) {
//            resultValidator(xhr, error);
//        },
//        success: function(json) {
//            LOCK.unLock();
//            btnGravar();
//            
//            var tcid = json.tcid;
//            var cidc = tcid.cidConf;
//            showStatusAgendamento(cidc.cidcTsAtu, cidc.cidcTsCad, cidc.loginLogout.usuario.entidadeFisica.entidade.entiNome, "", "Gravado em: ");
//        },
//        complete: function() {
//            $(".load-ajax").css({
//                display:"none"
//            });
//        }
//    });
//}
//
//$(document).on("click", function (e) {
//    
//    
//    $("#btnSubmit").on("click", function(){
//        grava();
//    });
//    
//    
//});
//
//
