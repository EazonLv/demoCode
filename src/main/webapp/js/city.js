$(function() {

$("#cityname").blur(
		function() {
			$("#cityname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#cityname").after("<span id='cityname_msg' style='color: red'>地区名称不能为空</span>");
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
var cityname = $("#cityname").val();
var memo = $("#memo").val();
$("#cityname_msg").empty();
$("#memo_msg").empty();
if (cityname == "" || cityname == null) {
	$("#cityname").after("<span id='cityname_msg' style='color: red'>地区名称不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#cityname_msg").empty();
$("#memo_msg").empty();
});

});
