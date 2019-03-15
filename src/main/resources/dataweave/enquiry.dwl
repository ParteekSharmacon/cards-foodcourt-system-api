%dw 1.0
%output application/xml
%namespace ns0 urn:microsoft-dynamics-schemas/codeunit/PrepaidCard
---
{
	ns0#PrepaidCard_Balance: {
		ns0#cardno: payload.cardDetails.card_no 
	}
}