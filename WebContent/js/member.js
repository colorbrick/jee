/**
 @ Date : 2015.06.18
 @ Author : 허성조
 @ Story : member.jsp, memberForm.jsp 관련 js 파일
 */
var searchId = function(url) {
	window.open(
					url,
					"searchId",
					"scrollbars, toolbar=no, location=no, directories=no,status=no, menubar=yes, resizable=yes, width=600, height=500, top=200, left=400");
}
var searchPass = function(url) {
	window.open(
					url,
					"searchPass",
					"scrollbars, toolbar=no, location=no, directories=no,status=no, menubar=yes, resizable=yes, width=600, height=500, top=200, left=400");
}

var join = function() {
	document.frmJoin.submit();
}

var login = function() {
	document.frmLogin.submit();
}



