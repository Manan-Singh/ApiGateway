# Http Requests Documentation

## Add a Strategy

`POST`: localhost:8081/strategies

#### Header
```
Content-Type : application/json
```

#### Body
```
{
	"stock": "GOOG",
	"active": "yes",
	"entry": 1000,
	"strategyType": "bollinger"
}
```

## Add a Trade

`POST`: localhost:8081/trades

#### Header
```
Content-Type : application/json
```

#### Body
```
{
	"price" : 300.50,
	"tradeType" : "buy",
	"stock": "GOOG",
	"strategy" : "http://localhost:8081/strategies/2"
}
```

## Patch a Trade field

`PATCH`: localhost:8081/trades/1

#### Header
```
Content-Type : application/json
```

#### Body
```
{
	"price" : 250,
}
```

## Delete a Strategy

`DELETE`: localhost:8081/strategies/1

## Delete a Trade

`DELETE`: localhost:8081/trades/1
