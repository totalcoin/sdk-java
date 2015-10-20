#Métodos

1. getAccessToken: Utiliza el Email y AppKey de la instancia, y retorna un AuthorizeResponse con estas propiedades:

```
Message: ""
IsOk: true
Response: {
	TokenId: "2917A1D5-14BB-4ED2-AA1B-92733577E057"
	UserName: "usuario@dominio.com"
}
```

2. performCheckout: Recibe un objeto CheckoutRequest con estas propiedades:

```
"Amount" : 10,
"Quantity" : 1,
"Country" : "ARG",
"Currency" : "ARS",
"Description" : "Zapatillas adidas",
"FailureURL" : "http://totalcoin.com/failure",
"PendingURL" : "http://totalcoin.com/pending",
"SuccessURL" : "http://totalcoin.com/success",
"PaymentMethods" : "CREDITCARD|CASH|TOTALCOIN",
"Reference" : "004557898",
"Site": "WordPress",
"MerchantId": "EF0EA4C9-1C5E-41CC-8281-60BC33D4B122"
```

Retorna un objeto CheckoutResponse con estas propiedades:
```
Message: ""
IsOk: true
Response: {
	URL: "http://..."
}
```

3. GetMerchants: Utiliza el Email y AppKey de la instancia, y retorna un Response con estas propiedades

```
Message: ""
IsOk: true
Response: [
	{
		"Id": "8E9FC192-BB16-4948-A69F-005290591682",
		"Name": "Merchant1"
	},
	{
		"Id": "CD894EFB-BEE6-49EE-9B40-172E1210C821",
		"Name": "Merchant2"
	},
]
```

4. GetIpnInfo: Utiliza la AppKey de la instancia, y recibe como parámetro la referencia de la transacción

```
IsOk: true,
Message: null,
Response: {
	"Reference": "0000000017",
	"MerchantReference": "00010",
	"TransactionType": "Unknown",
	"Reason": "prueba",
	"Currency": "ARS",
	"PaidAmount": 5000,
	"NetAmount": 4756.18,
	"FinancingCost": 0,
	"TotalAmount": 5000,
	"TransactionHistories": [
		{
			"Date": "2015-06-23T16:04:59.09",
			"TransactionState": "InProccess"
		}
	],
	"Merchant": {
		"Id": "36102d0f-0023-429f-a125-b1ed56616c37",
		"Name": "Comercio Predefinido"
	},
	"FromUser": {
		"Phone": null,
		"FullName": "SEBASTIAN LAZARTE",
		"Email": "sebalazarte@outlook.com"
	},
	"ToUser": {
		"Phone": null,
		"FullName": "MAURO ZUCCOLO",
		"Email": "maurozuccolo@gmail.com"
	},
	"Provider": {
		"Name": "PAGO FACIL",
		"PaymentMethod": "Cash"
	}
}
```

#Ejemplos de uso

Se deberá importar el SDK de TotalCoin al proyecto realizado en Java

1. Creación del objeto API:

```
import com.totalcoin.java.sdk.api.TotalCoin;

TotalCoin api = new TotalCoin("email", "appKey");
```

2. Checkout:

```
CheckoutRequest chRq = new CheckoutRequest();
chRq.setAmount(122);
chRq.setCountry("ARG");
chRq.setCurrency("ARS");
chRq.setDescription("compra en pesos");
chRq.setFailureURL("http://totalcoin.com/failure");
chRq.setPaymentMethods("CASH");
chRq.setPendingURL("http://totalcoin.com/pending");
chRq.setReference("1392903");
chRq.setSite("http://totalcoin.com");
chRq.setSuccessURL("http://totalcoin.com/success");
chRq.setQuantity("1");
chRq.setMerchantId(merchRs.getMerchants().get(0).getId());

CheckoutResponse chRs = api.performCheckout(chRq);

System.out.println(chRs.toString());
```

3. GetMerchants:

```
MerchantResponse merchRs = api.getMerchants();
System.out.println(merchRs.toString());
```

3. GetIpnInfo:

```
IpnResponse ipnRs = api.getIpnInfo("0000000042");
System.out.println(ipnRs.toString());
```
