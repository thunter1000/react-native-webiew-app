import React, { Component } from 'react';
import { WebView } from 'react-native-webview';

class App extends Component {
    render() {
        return (
            <WebView
                source={{ uri: "https://www.google.com" }}
                style={{ marginTop: 20 }}
                onLoadProgress={e => console.log(e.nativeEvent.progress)}
            />
        );
    }
}

export default App;
