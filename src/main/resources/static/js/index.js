var hasConsole = typeof console !== "undefined"



if (window.requestIdleCallback) {
    requestIdleCallback(function () {
        var d1 = new Date()
        Fingerprint2.get(function (components) {
          var murmur = Fingerprint2.x64hash128(components.map(function (pair) { return pair.value }).join(), 31)
          var d2 = new Date()
          var time = d2 - d1
          var fingerPrintDetails = {}
          fingerPrintDetails["fingerprint"] = murmur
          document.querySelector("#time").textContent = time
          document.querySelector("#fp").textContent = murmur
          if(hasConsole) {
            console.log("time", time)
            console.log("fingerprint hash", murmur)
          }
          for (var index in components) {
            var obj =  components[index]
            if (typeof obj.value != "object")
              fingerPrintDetails[obj.key] =  obj.value
            else fingerPrintDetails[obj.key] = obj.value.toString()
            var line = obj.key + " = " + String(obj.value).substr(0, 100)
            if (hasConsole) {
              console.log(line)
            }
            details += line + "\n"
          }
          document.querySelector("#details").textContent = details
          $.ajax({
              type: "POST",
              contentType: "application/json",
              url: "/saveFp",
              data: JSON.stringify(fingerPrintDetails),
              dataType: 'json',
              timeout: 600000,
              success: function () {
                  console.log("success");
                  //...
              },
              error: function (e) {
                  console.log(e);
                  //...
              }
          });
        })
    })
} else {
    setTimeout(function () {
        Fingerprint2.get(function (components) {
          console.log(components) // an array of components: {key: ..., value: ...}
        })
    }, 500)
}
