<form>
  <p style="font-size:150% ; color:red;">Your password was incorrect!</p>
  <input type="password" value="obama123"></input>

</form>
<style>
body {
  background-color: #f1f1f1;
  font-size: 24px;
  font-family: Arial, Helvetica, sans-serif;
}

form {
  text-align: center;
  background: #fff;
}

input[type=password] {
  font-size: 24px;
  padding: 0.25em;
  border: 2px solid #999;
  
  /* 2 animations: shake, and glow red */
  animation-name: shake, glow-red;
  animation-duration: 0.7s, 0.35s;
  animation-iteration-count: 1, 2;
}

@keyframes shake {
  0%, 20%, 40%, 60%, 80% {
    transform: translateX(8px);
  }
  10%,
  30%,
  50%,
  70%,
  90% {
    transform: translateX(-8px);
  }
}

@keyframes glow-red {
  50% {
    border-color: indianred;
  }
}

</style>