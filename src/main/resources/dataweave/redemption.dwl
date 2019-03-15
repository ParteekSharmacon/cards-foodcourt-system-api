%dw 1.0
%output application/xml
%namespace ns0 urn:microsoft-dynamics-schemas/codeunit/PrepaidCard
---
{
	ns0#Prepaid_Card_Redemption: {
		ns0#cardno: payload.cardDetails.card_no,
		ns0#cardamt: payload.cardDetails.card_amt,
		ns0#recNo: payload.txn_Details.receipt_no,
		ns0#lStoreno: payload.storeId,
		ns0#lTerminal: payload.terminalId,
		ns0#transNo: payload.txn_Details.order_id as :number
	}
}