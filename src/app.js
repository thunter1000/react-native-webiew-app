import React, { Component } from 'react';
import { WebView } from 'react-native-webview';
import Config from 'react-native-config';

class App extends Component {
    render() {
        return (
            <WebView
                source={{ uri: Config.WEBVIEW_LOCATION }}
                style={{ marginTop: 20 }}
                onLoadProgress={e => console.log(e.nativeEvent.progress)}
            />
        );
    }
}

export default App;
