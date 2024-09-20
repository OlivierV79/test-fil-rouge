import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.tsx'
import Accueil from './pages/Accueil/Accueil'
import './index.css'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    {/*<App />*/}
      <Accueil />
  </StrictMode>,
)
