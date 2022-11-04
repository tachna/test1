<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
  <form action="signUp.do" method="post">
	<table>
		<thead>
			<tr>
				<th colspan="2">회원가입</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>아이디*</th>
				<td><input type="text" required="required"/></td>
			</tr>
			<tr>
				<th>비밀번호*</th>
				<td><input type="password" required="required"/></td>
			</tr>
			<tr>
				<th>아이디*</th>
				<td><input type="text" required="required"/></td>
			</tr>
			<tr>
				<th>이름*</th>
				<td><input type="text" name="name" required="required"/></td>
			</tr>
			<tr>
				<th>부서*</th>
				<td>
					<select name="deptCd" required="required">
						<option value="01">개발부</option>
						<option value="02">영업부</option>
						<option value="03">총무부</option>
					</select>	
				</td>
			</tr>
		</tbody>
	</table>
  </form>
</body>
</html>