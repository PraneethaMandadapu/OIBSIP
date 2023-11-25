const tempCalc = () => {
    const inputTemperature = document.getElementById('temp').value;

    const tempSelected = document.getElementById('type');
    const valueTemp = type.options[tempSelected.selectedIndex].value;
    const celToFah = (cel) => {
        let fahrenheit = ((cel * 9 / 5) + 32).toFixed(1);
        return fahrenheit;
    }
    const fahToCel = (fah) =>
     {
        let celsius = ((fah - 32) * 5 / 9).toFixed(1);
        return celsius;
    }
    if (valueTemp == 'cel') {
        document.getElementById("result").innerHTML = celToFah(inputTemperature) + "  Fahrenheit";
    }
    else 
    {
        document.getElementById("result").innerHTML = fahToCel(inputTemperature) + "  Celsius";
    }
}
