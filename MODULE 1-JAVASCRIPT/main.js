              let submitted=false;
                let seatsf=750;
                let seatsc=750;
                let seatst=750;
                var s;
                function odisplay(){
                    event.preventDefault();
                    window.alert("Registration confirmed");
                    document.getElementById("display").textContent="Registration Confirmed contact the management";
                    submitted=true;
                    var a=eventdetails(s);
                    document.getElementById("display1").textContent=a;
                    }
            function eventdetails(s){
             const ename=document.getElementById("eventtype").value;
            const edate=document.getElementById("date").value;
            return `EventName:${ename}
            Date:${edate}
            Available Seats:${s}`;
                }
                if(seatsf==0)
                    document.querySelector('option[value="FoodFestival"]').hidden=true;
                if(seatsc==0)
                    document.querySelector('option[value="Community Clean Up"]').hidden=true;
                if(seatst==0)
                    document.querySelector('option[value="Talent Show"]').hidden=true;
                function valid(){
                 let no= document.getElementById("phno").value;
                  if(no.trim()==="")
                     document.getElementById("ovalid").textContent="please enter the phone no!";
                       
                }
                function fee(){
                    const a=document.getElementById("eventtype").value;
                    localStorage.setItem("eventtype",a);
                    if(a==="FoodFestival"){
                    document.getElementById("msg").textContent="EVENT FEE:Rs.800"+ " "+"Available seats:"+seatsf;
                    s=--seatsf;
                    }
                   else if(a==="Community Clean up"){
                    document.getElementById("msg").textContent="EVENT FEE:Rs.400"+" "+"Available seats:"+seatsc;
                    s=seatsc--;
                   }
                   else if(a==="Talent Show"){
                    document.getElementById("msg").textContent="EVENT FEE:Rs.900"+" "+"Available seats:"+seatst;
                    s=seatst--;
                   }
                  else
                     document.getElementById("msg").textContent="please select one event";
                   
                }
                      let enlarged = false;

                     function large(img){
                      if (!enlarged) {
                       img.style.width = "600px";
                       img.style.height= "600px";
                       enlarged = true;
                     } else {
                         img.style.width = "400px";
                         img.style.height= "300px";
                         enlarged = false;
                          }
                }
                function vid(){
                    document.getElementById("ready").innerText="Video Ready To Play";
                }
                 window.addEventListener("beforeunload", function (e) {
               if (!submitted) {
      e.preventDefault(); 
      e.returnValue = 'please submit the form'; 
    }
  });
  function clearform(){
   document.querySelector("form").reset();
   document.getElementById("msg").textContent = ""; 
   document.getElementById("eventtype").selectedIndex = 0;
   localStorage.clear();
   sessionStorage.clear();
  }
  function findLocation() {
      const locat = document.getElementById("location");
      locat.textContent = "Locating...";

      if (!navigator.geolocation) {
        locat.textContent = "Geolocation is not supported by your browser.";
        return;
      }
      
      navigator.geolocation.getCurrentPosition(
        function(position) {
          const latitude = position.coords.latitude;
          const longitude = position.coords.longitude;
          locat.innerHTML = `<strong>Your Location:</strong><br>Latitude: ${latitude}<br>Longitude: ${longitude}`;
        },
        function(error) {
          switch (error.code) {
            case error.PERMISSION_DENIED:
              locat.textContent = "Error: Permission denied.";
              break;
            case error.POSITION_UNAVAILABLE:
              locat.textContent = "Error: Position unavailable.";
              break;
            case error.TIMEOUT:
              locat.textContent = "Error: Request timed out.";
              break;
            default:
              locat.textContent = "An unknown error occurred.";
          }
        },
      );
    }
    function displaynone() {
    document.getElementById("location").style.display = "none";
  }

  function visiblenone() {
    document.getElementById("location").style.visibility = "hidden";
  }