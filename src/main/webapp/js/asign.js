$(function() {

$("#ano").blur(
		function() {
			$("#ano_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#ano").after("<span id='ano_msg' style='color: red'>报名单号不能为空</span>");
			}
	});

$("#usersid").blur(
		function() {
			$("#usersid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#usersid").after("<span id='usersid_msg' style='color: red'>学生不能为空</span>");
			}
	});

$("#schoolid").blur(
		function() {
			$("#schoolid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#schoolid").after("<span id='schoolid_msg' style='color: red'>学校不能为空</span>");
			}
	});

$("#degreeid").blur(
		function() {
			$("#degreeid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#degreeid").after("<span id='degreeid_msg' style='color: red'>学位不能为空</span>");
			}
	});

$("#fileurl").blur(
		function() {
			$("#fileurl_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#fileurl").after("<span id='fileurl_msg' style='color: red'>报名文件不能为空</span>");
			}
	});

$("#price").blur(
		function() {
			$("#price_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#price").after("<span id='price_msg' style='color: red'>费用不能为空</span>");
			}
	});

$("#memo").blur(
		function() {
			$("#memo_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
			}
	});







$('#sub').click(function(){
var ano = $("#ano").val();
var usersid = $("#usersid").val();
var schoolid = $("#schoolid").val();
var degreeid = $("#degreeid").val();
var fileurl = $("#fileurl").val();
var price = $("#price").val();
var memo = $("#memo").val();
$("#ano_msg").empty();
$("#usersid_msg").empty();
$("#schoolid_msg").empty();
$("#degreeid_msg").empty();
$("#fileurl_msg").empty();
$("#price_msg").empty();
$("#memo_msg").empty();
if (ano == "" || ano == null) {
	$("#ano").after("<span id='ano_msg' style='color: red'>报名单号不能为空</span>");
	return false;
}
if (usersid == "" || usersid == null) {
	$("#usersid").after("<span id='usersid_msg' style='color: red'>学生不能为空</span>");
	return false;
}
if (schoolid == "" || schoolid == null) {
	$("#schoolid").after("<span id='schoolid_msg' style='color: red'>学校不能为空</span>");
	return false;
}
if (degreeid == "" || degreeid == null) {
	$("#degreeid").after("<span id='degreeid_msg' style='color: red'>学位不能为空</span>");
	return false;
}
if (fileurl == "" || fileurl == null) {
	$("#fileurl").after("<span id='fileurl_msg' style='color: red'>报名文件不能为空</span>");
	return false;
}
if (price == "" || price == null) {
	$("#price").after("<span id='price_msg' style='color: red'>费用不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#ano_msg").empty();
$("#usersid_msg").empty();
$("#schoolid_msg").empty();
$("#degreeid_msg").empty();
$("#fileurl_msg").empty();
$("#price_msg").empty();
$("#memo_msg").empty();
});

});
