Feature: Amazon

    Scenario: Sepete Urun Ekleme-Silme
    Given Uygulama acilir
    When  Arama cubuguna "Telefon" yazilir
    When  Ara butonuna tiklanir
    When cerezleri kabul ete tiklanir
    When Markalardan "Apple" secilir
    When 2. sayfaya gidilir
    When "Alaskan Blue" telefon kilifi secilir
    When  Sepete ekleye tiklanir
    When  Sepete gidilir
    Then urunun varlıgı kontrol edilir
    When Urun sepetten cikarilir
    Then urunun yoklugu kontrol edilir