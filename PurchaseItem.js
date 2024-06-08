const notes=[3,2,1,1];
const price=40;
purchase(notes,price);
function purchase(notes,price)
{
    const N=[10,50,100,200];
     let total=0;

     for(let i=0;i<notes.length;i++)
        {
            total=total+notes[i]*N[i];
        }
        console.log(total);

        if(total>price)
            {
                console.log("I can purchase");
            }
        else{
            console.log("I need more money");
        }
    

}