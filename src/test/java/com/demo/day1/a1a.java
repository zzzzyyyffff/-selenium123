{
        "capabilities":[
        {
        "browserName":"chrome",
        "maxInstances":10,
        "platform":"WINDOWS",
        "version":"55",
        "webdriver.chrome.driver":"chrome driver.exe"
        },
        {
        "browserName":"firefox",
        "maxInstances":10,
        "platform":"WINDOWS",
        "version":"47"
        }
        ],
        "configuration":{
        "proxy":"org.open qa.grid.selenium.proxy.DefaultRemoteProxy",
        "maxSession":10,
        "port":5555,
        "register":true,
        "registerCycle":5000,
        "hub":"http：//http://192.168.1.9:4444/"
        }
        }
