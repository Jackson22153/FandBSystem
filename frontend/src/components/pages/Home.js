import { Route, Routes } from "react-router";

import { Footer } from "../layouts/Footer";
import Header from "../layouts/Header";
import MenuComponent from "./Menu";
import { DefaultHomeComponent } from "./DefaultHome";
import { MENU_URI, RESERVATION_URI } from "../../constants/WebPageURI";
import ReservationComponent from "./Reservation";

export default function HomeComponent(){


    return(
        <>
            {/* <div id="loader">
                <div id="status"></div>
            </div> */}
            <Header/>

            <Routes>
                <Route path="*" element={<DefaultHomeComponent/>}/>
                <Route path={RESERVATION_URI} element={<ReservationComponent/>}/>
                <Route path={MENU_URI} element={<MenuComponent/>}/>
            </Routes>

            <Footer/>
        </>
    )
}