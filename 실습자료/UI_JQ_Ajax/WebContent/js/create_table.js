function makeTable(elem){
	$table = $("<table border=1>")
//	var $table = $("<table border=1>")
	// 둘의 차이는 var를 쓰면 지역변수로 선언되고, 쓰지않으면 전역변수로 선언된다.
	
	for(var i=0; i<1;i++){ //table의 제목을 가져오는 부분이다.
		$tr = $("<tr>");
		
		for(var j=0;j<elem.eq(0).children().length;j++){
			$td = $("<td>").append(elem.eq(0).children().eq(j).prop("tagName"));
			$tr.append($td);
		}
		$table.append($tr);
	}
	
	for(var i=0;i<elem.length;i++){ //table에 들어갈 값들을 가져오는 부분이다.
		$tr = $("<tr>");
		for(var j=0;j<elem.eq(i).children().length;j++){
			$td = $("<td>").append(elem.eq(i).children().eq(j).text());
			$tr.append($td);
		}
		$table.append($tr);
	}
	
	return $table;
	
}