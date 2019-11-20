package com.dynamis.behealthy.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "llave.alguna";
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAvar0UgS2NjRvzdptqsVXeGQyfgdg60fMWDKv+ljRxdaMRWW2\r\n" + 
			"rliFjlar7KgF6T3IzfiYI0v2UO6Vx9nohhaRPb/3ZUEooV1I/w82H/1rjtlIIvE4\r\n" + 
			"EqA3tbfqhAixMR9FGSWAxuLfytlfKQ1vffOw9fNUGPEB3Bm9C927KKC3fM7bzjNr\r\n" + 
			"vv+1XPVFPU/rSrXlUJpLEoA6tznm980H9coT3oBPklb7tEqk9OwygDYphbd23T57\r\n" + 
			"29R0/o9NzRMhZ+PAVS4TU5GIweJiocoUpDYRzseSzSDbCvLilIrp/rV5eCwhWyB8\r\n" + 
			"sawU9GRwhsbVfFkYZqoASGlBL09o12ZX49XklQIDAQABAoIBAQCYkl+tZqro2a+i\r\n" + 
			"iXY0rECb0QYpCWh2e7Autr+HBFHi8p6t6I9WmlD9Wk08t0DiClhxD+vaYO3I1tPY\r\n" + 
			"CzuYOakmYjjx08OKYs8oliT1ANe39qOnsCFqIkYOQN8+zPs0x7G+88MuuixKMifx\r\n" + 
			"jyRDzndosg/RbHYRhwbi97/pg7d2hlBXLymCNZis263uKys8TkLKAPJ1bxd1714T\r\n" + 
			"K03l3o/yn+NwgM7TL4sUQJDg8Ia1cOBBL2u2PxMKs8vAlkB/gBB1mtdAE83JQQ0O\r\n" + 
			"IiJc7oHQA6JosratUCp/50Lm/GailwgkFnl01KOj+qcQaQVfvXYhQ7x+JTyvUg0T\r\n" + 
			"jvEwA5pVAoGBAPNrDBrBvBtwRTRmDf3ZOJ98/3q4YUR7Ovsh8RnTYLH7w46LWuGW\r\n" + 
			"ZnafbFiEJQMnHPrSgwE9Mv8t7Tc4T8bgghGdKSNWLxP5BmyHdNoOkjwFUSXnrWyh\r\n" + 
			"zo+1yNlBE8CXOyJ3WvWWWeE5BlB+ZPFEL+yGghxAYJ+l+t4EzAtdklhvAoGBAMd4\r\n" + 
			"rDIVl39wJpcoH3fEZG3pOYInsvijTn7RKpsRZinszLNZ39bBWZneoLw5mrIoUO2m\r\n" + 
			"rCsxWBXtCUtFX5fIZRsrAt6Z4GQBz3csNih9si0JLhRhdg54zZQFmhKnHQBqlZ9z\r\n" + 
			"W8v/EtvmTWumJ/iP4lLtqSvlGfeu0IHrNSkncC07AoGBALX//u/ulOALJKNV/vYj\r\n" + 
			"OTP+eOLgA1H5tZLZwPRnWHAbZw8oYM407u2Yq6DPRQFDeGaNiYgeoweq5ieYggWY\r\n" + 
			"DYhv8rdKFC8hzczNxu/XXz1jWFY4EDIeFVzcNY1DHCquqHdPuIHRZeiBA5ihuIWw\r\n" + 
			"TwjRVW0cMWKM7rKb8Zg54VcfAoGABVRVDXWEObRuY4V/6bxGjqU3kyGqZ3g9hafj\r\n" + 
			"AoeheidIhNY2488ArNrE4qKLXo0zNFZKrVDBMLzHjcpJto11Hhe1GOt1klZ2C5IT\r\n" + 
			"1FsfYpKnN4YvGE3j+Dt6FVt/q94tJzh20Gl9QIDTureSw9JcUqjk5zZUzkhOa9oz\r\n" + 
			"7miOV7cCgYBN1P/PXnYoAyFoSR3xCc3dJQm8QHafxDS4tgW7iyUKj7Vm6Jm84TIW\r\n" + 
			"lyAYJklgC7VI/OwvBFLfAb3nSuFTJErcPv5xoLbCqafEyKkSEX5B4ubNppt+Px7P\r\n" + 
			"MDqscxoUEIADfEFP4/p/z7KgB2+ZwgMSZE1kJbFxkRJYkqva8bomdA==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
		public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvar0UgS2NjRvzdptqsVX\r\n" + 
				"eGQyfgdg60fMWDKv+ljRxdaMRWW2rliFjlar7KgF6T3IzfiYI0v2UO6Vx9nohhaR\r\n" + 
				"Pb/3ZUEooV1I/w82H/1rjtlIIvE4EqA3tbfqhAixMR9FGSWAxuLfytlfKQ1vffOw\r\n" + 
				"9fNUGPEB3Bm9C927KKC3fM7bzjNrvv+1XPVFPU/rSrXlUJpLEoA6tznm980H9coT\r\n" + 
				"3oBPklb7tEqk9OwygDYphbd23T5729R0/o9NzRMhZ+PAVS4TU5GIweJiocoUpDYR\r\n" + 
				"zseSzSDbCvLilIrp/rV5eCwhWyB8sawU9GRwhsbVfFkYZqoASGlBL09o12ZX49Xk\r\n" + 
				"lQIDAQAB\r\n" + 
				"-----END PUBLIC KEY-----\r\n" + 
				"\r\n" + 
				"";
			
			

}
