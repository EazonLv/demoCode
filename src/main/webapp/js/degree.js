$(function() {

$("#degreename").blur(
		function() {
			$("#degreename_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#degreename").after("<span id='degreename_msg' style='color: red'>学位名称不能为空</span>");
			}
	});

$("#price").blur(
		function() {
			$("#price_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#price").after("<span id='price_msg' style='color: red'>报名费用不能为空</span>");
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
var degreename = $("#degreename").val();
var price = $("#price").val();
var memo = $("#memo").val();
$("#degreename_msg").empty();
$("#price_msg").empty();
$("#memo_msg").empty();
if (degreename == "" || degreename == null) {
	$("#degreename").after("<span id='degreename_msg' style='color: red'>学位名称不能为空</span>");
	return false;
}
if (price == "" || price == null) {
	$("#price").after("<span id='price_msg' style='color: red'>报名费用不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#degreename_msg").empty();
$("#price_msg").empty();
$("#memo_msg").empty();
});

});
