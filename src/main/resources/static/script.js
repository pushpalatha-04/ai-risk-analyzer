async function analyze() {

    const description = document.getElementById("description").value;

    const response = await fetch("/api/risk", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(description)
    });

    const text = await response.text();

    document.getElementById("result").innerText = text;
}