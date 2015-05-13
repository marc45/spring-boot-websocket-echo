<html>
<head>
    <title>WebSocket Test</title>
    <script type="text/javascript" src="http://lib.sinaapp.com/js/jquery/1.9.1/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        var ws = null;
        function connect() {
            ws = new WebSocket("ws://" + window.document.location.host + "/echo");
            ws.onopen = function () {
                $("#status").text("创建链接成功, 开始发送消息");
                setInterval(function () {
                    ws.send($("#hello").val());
                }, 1000);
            };
            ws.onmessage = function (event) {
                $("#msg").text(event.data);
            };
            ws.onclose = function () {
                $("#status").text("链接断开, 重连");
                setTimeout(function () {
                    connect();
                }, 1000);
            };
        }
        function disconnect() {
            if (ws != null) {
                ws.close();
                ws = null;
            }
        }
        connect();
    </script>
</head>

<body>
<input type="text" id="hello" value="PING"/>

<div id="msg"></div>
<div id="status"></div>
</body>

</html>