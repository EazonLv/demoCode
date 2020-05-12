$(function() {

$("#schoolname").blur(
		function() {
			$("#schoolname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#schoolname").after("<span id='schoolname_msg' style='color: red'>学校名称不能为空</span>");
			}
	});

$("#cityid").blur(
		function() {
			$("#cityid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#cityid").after("<span id='cityid_msg' style='color: red'>所在地区不能为空</span>");
			}
	});

$("#image").blur(
		function() {
			$("#image_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#image").after("<span id='image_msg' style='color: red'>图片不能为空</span>");
			}
	});

$("#contents").blur(
		function() {
			$("#contents_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contents").after("<span id='contents_msg' style='color: red'>学校介绍不能为空</span>");
			}
	});







$('#sub').click(function(){
var schoolname = $("#schoolname").val();
var cityid = $("#cityid").val();
var image = $("#image").val();
var contents = $("#contents").val();
$("#schoolname_msg").empty();
$("#cityid_msg").empty();
$("#image_msg").empty();
$("#contents_msg").empty();
if (schoolname == "" || schoolname == null) {
	$("#schoolname").after("<span id='schoolname_msg' style='color: red'>学校名称不能为空</span>");
	return false;
}
if (cityid == "" || cityid == null) {
	$("#cityid").after("<span id='cityid_msg' style='color: red'>所在地区不能为空</span>");
	return false;
}
if (image == "" || image == null) {
	$("#image").after("<span id='image_msg' style='color: red'>图片不能为空</span>");
	return false;
}
if (contents == "" || contents == null) {
	$("#contents").after("<span id='contents_msg' style='color: red'>学校介绍不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#schoolname_msg").empty();
$("#cityid_msg").empty();
$("#image_msg").empty();
$("#contents_msg").empty();
});

});
