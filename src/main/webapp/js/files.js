$(function() {

$("#filesname").blur(
		function() {
			$("#filesname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#filesname").after("<span id='filesname_msg' style='color: red'>文件名称不能为空</span>");
			}
	});

$("#fileurl").blur(
		function() {
			$("#fileurl_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#fileurl").after("<span id='fileurl_msg' style='color: red'>文件地址不能为空</span>");
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
var filesname = $("#filesname").val();
var fileurl = $("#fileurl").val();
var memo = $("#memo").val();
$("#filesname_msg").empty();
$("#fileurl_msg").empty();
$("#memo_msg").empty();
if (filesname == "" || filesname == null) {
	$("#filesname").after("<span id='filesname_msg' style='color: red'>文件名称不能为空</span>");
	return false;
}
if (fileurl == "" || fileurl == null) {
	$("#fileurl").after("<span id='fileurl_msg' style='color: red'>文件地址不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#filesname_msg").empty();
$("#fileurl_msg").empty();
$("#memo_msg").empty();
});

});
