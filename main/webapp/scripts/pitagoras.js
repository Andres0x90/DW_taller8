function comprobar()
{
    let catA = document.getElementById("cateto_a").value;
    let catB = document.getElementById("cateto_b").value;
    
    if (catA != "" && catB != "")
    {
        if (catA == parseFloat(catA) && catB == parseFloat(catB))
        {
            return true;
        }
        else
        {
            alert("Por favor ingrese datos numericos");
            return false;
        }
    }
    else
    {
        alert("Por favor rellene todos los campos");
        return false;
    }
}