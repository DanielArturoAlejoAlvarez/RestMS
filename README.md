# RestMS
## Description
Software of Application created with JAVA , Apache Tomcat , Eclipse(IDE) and SoapUI, Web Service - REST Client
## Coding

### Service
```java
...
public VOUser validateUser(VOUser vo) {
		vo.setValid(false);
		if(vo.getUsername().equals("Admin") && vo.getPassword().equals("Password")) {
			vo.setValid(true);
		}
		vo.setPassword("################");
		return vo;
	}
...
```

### Client
```java
...
ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
...
```

## Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/DanielArturoAlejoAlvarez/RestMS. This project is intended to be a safe, welcoming space for collaboration, and contributors are expected to adhere to the [Contributor Covenant](http://contributor-covenant.org) code of conduct.


## License

The gem is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).


