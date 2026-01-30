<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<style>
    body{
        font-family: sans-serif;
    }
    form{
        background-color: black;
        border-radius: 10px;
        width: 40rem;
        margin: 10rem auto;
        padding: 20px 40px;

    }

    #input {
        margin: auto;
        color: white;
        display: flex;
        flex-direction: column;
        gap: 5px;
    }

    input{
        height: 40px;
        border-radius: 5px;
    }

    button{
        margin-right: 20px;
        padding: 10px 20px;
        background-color: blue;
        border-radius: 10px;
        border: none;
        color: white;
        cursor: pointer;
    }
</style>
<body>
<form action="add" method="post">
    <div id="input" >
        First number: <input type="text" name="num1"><br>
        Second number: <input type="text" name="num2"><br>
    </div>

    <button type="submit" name="operation" value="sum">Sum</button>
    <button type="submit" name="operation" value="product">Product</button>
    <button type="submit" name="operation" value="division">Division</button>
</form>
</body>
</html>