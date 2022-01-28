import React, {useEffect} from 'react';
import {StatusBar} from 'react-native';
import {Home} from './src/pages/Home';
import RNBootSplash from 'react-native-bootsplash';

export default function App() {
  useEffect(() => {
    RNBootSplash.hide({fade: true});
  }, []);
  return (
    <>
      <StatusBar barStyle="light-content" />
      <Home />
    </>
  );
}
